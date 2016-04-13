/**
 * Created by stasgordienko on 13.04.16.
 * Класс реализует простой калькулятор. Суммирует, выдает результат, очищает результат.
 */
public class Calculator {

    private int result;

    /**
     Суммирует параметры
     */
    public void add(int ... params){
        for(Integer p : params){
            this.result += p;
        }
    }

    /**
     Выдает результат
     */
    public int getResult(){
        return this.result;
    }

    /**
     Очищает результат
     */
    public cleanResult(){
        this.result = 0;
    }
}
