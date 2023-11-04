import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var num: Int = 0
    fun getCounter(): Int {
        return num
    }

    fun addNum(): Int {
        return ++num
    }

    fun removeNum(): Int {
        return --num;
    }
}