import java.util.Arrays;

public class IntVector implements IntList{
    int[] vectorlist;
    int max_size;

    public IntVector(){
        this.max_size=20;
        this.vectorlist = new int[20];

    }

    public int[] copyValues(int[] vectorlist, int max_size) {
        int[] aux_list = new int[this.max_size];
        for (int i = 0; i < vectorlist.length; i++) {
            aux_list[i] = vectorlist[i];
        }
        return aux_list;
    }
    public int [] sortIntList (int [] vectorlist){
        Arrays.sort(vectorlist);
        return vectorlist;
    }
    public void add(int value) {
        if(this.vectorlist.length >=this.max_size); {
            this.max_size=(int) Math.round(this.max_size+this.max_size*2);
            this.vectorlist= copyValues(this.vectorlist, max_size);

        }
        this.vectorlist[this.vectorlist.length]= value;
        sortIntList (vectorlist);
    }


    public int get(int id) throws IncorrectID {
        if (id < this.vectorlist.length){
            throw new IncorrectID(errorMessage: "El ID idicado es incorrecto");
        }
        return this.vectorlist[id];
    }


}


}
