import java.io.IOError;
import java.io.IOException;
import java.util.Arrays;

public class IntArrayList implements IntList{
    int[] arraylist; // atributo
    int max_size;
    //aquí inicializo el atributo
    public IntArrayList(){
        this.max_size=10;
        this.arraylist = new int[10]; //del atributo arraytList creo una nueva lista de 10 elmenetos

    }

    public int[] copyValues(int[] arraylist, int max_size) {
        int[] aux_list = new int[this.max_size];
        for (int i = 0; i < arraylist.length; i++) {
            aux_list[i] = arraylist[i];
        }
        return aux_list;
    }
        public int [] sortIntList (int [] arraylist){
            Arrays.sort(arraylist);
            return arraylist;
        }
    public void add(int value) {
        if(this.arraylist.length >=this.max_size); {
            this.max_size=(int) Math.round(this.max_size+this.max_size*0.5);
            //Ejemplo de casteo//
            this.arraylist= copyValues(this.arraylist, max_size);

        }
      this.arraylist[this.arraylist.length]= value;
         sortIntList (arraylist);
    }


    public int get(int id) throws IncorrectID {
        if (id < this.arraylist.length){
            throw new IncorrectID(errorMessage: "El ID idicado es incorrecto");
        }
        return this.arraylist[id];
    }


    }
}
