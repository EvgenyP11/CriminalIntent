package com.example.criminalintent

/* библиотеки Jetpack*/
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import androidx.fragment.app.Fragment


class CrimeFragment : Fragment() {

    private lateinit var crime: Crime
    private lateinit var titleField: EditText
    private lateinit var dateButton: Button
    private lateinit var solvedCheckBox: CheckBox

/*в onСreate переменная crime обращается к классу Crime*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        crime = Crime()
    }
/*
    В функции onCreateView(...) мы явно заполняем представление фрагмента,
 вызывая LayoutInflater.inflate(...) с передачей идентификатора ресурса макета.
 Второй параметр определяет родителя представления,
 что обычно необходимо для правильной настройки виджета.
 Третий параметр указывает, нужно ли включать заполненное представление в родителя.
 */
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_crime, container, false)
        titleField = view.findViewById(R.id.crime_title) as EditText
        dateButton = view.findViewById(R.id.crime_date) as Button
        solvedCheckBox = view.findViewById(R.id.crime_solved) as CheckBox

        dateButton.apply {
            text = crime.date.toString()
            isEnabled = false
        }
    return view
    }

    override fun onStart() {
        super.onStart()

        val titleWatcher = object : TextWatcher{

            override fun beforeTextChanged(
                sequence: CharSequence?,
                start: Int,
                count: Int,
                after: Int) {
                // Это пространство оставлено пустым специально
                TODO("Not yet implemented")
                // Это пространство оставлено пустым специально
            }

            override fun onTextChanged(
                sequence: CharSequence?,
                start: Int,
                before: Int,
                count: Int
            ) {
                crime.title = sequence.toString()
            }

            override fun afterTextChanged(sequence: Editable?) {
                // Это пространство оставлено пустым специально
                TODO("Not yet implemented")
                // Это пространство оставлено пустым специально
            }
        }

        titleField.addTextChangedListener(titleWatcher)

        solvedCheckBox.apply {
            setOnCheckedChangeListener{_, isChecked ->
                crime.isSolved = isChecked
            }
        }
    }

}