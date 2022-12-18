
package genericmahasiswaku;


public class GenericMahasiswaKu {


    public static void main(String[] args) {
        
        Mahasiswa <String,String,Integer> m = new Mahasiswa <>();
        m.setNim("2021089");
        m.setNama("edom");
        m.setClas(21);
        
        System.out.println(m.getNIm());
        System.out.println(m.getNama());
        System.out.println(m.getClas());
        
    }
}
