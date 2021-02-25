package hu.bme.mit.train.tacho;

import com.google.common.collect.HashBasedTable;
import hu.bme.mit.train.interfaces.TacoInterface;
import com.google.common.collect.Table;
public class Tacho  implements TacoInterface {

    public Table<Integer, Integer, Integer>  table;

    public Tacho()
    {
        table = HashBasedTable.create();
    }

    @Override
    public void addElement(int time, int pos, int refSpeed) {
        table.put(time, pos, refSpeed);
    }
}
