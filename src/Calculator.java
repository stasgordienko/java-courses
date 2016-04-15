/**
 * Created by stasgordienko on 13.04.16.
 * Класс реализует простой калькулятор. Суммирует, выдает результат, очищает результат.
 */
public class Calculator {

    private Double result;

    /**
     Суммирует параметры
     */
    public void add(Double ... params){
        for(Double p : params){
            this.result += p;
        }
    }

    /**
     Выдает результат
     */
    public Double getResult(){
        return this.result;
    }

    /**
     Очищает результат
     */
    public void cleanResult(){
        this.result = 0D;
    }
}
