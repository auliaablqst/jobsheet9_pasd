public class StackSurat06 {
    Surat06[] stack;
    int top;
    int size;
    
    public StackSurat06(int size) {
        this.size = size;
        stack = new Surat06[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat06 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack Penuh! Tidak bisa menambahkan surat lagi.");
        }
    }

    public Surat06 pop() {
        if (!isEmpty()) {
            Surat06 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat06 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat yang dikumpulkan.");
            return null;
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan!");
                System.out.println("ID Surat        : " + stack[i].idSurat);
                System.out.println("Nama Mahasiswa  : " + stack[i].namaMahasiswa);
                System.out.println("Kelas           : " + stack[i].kelas);
                System.out.println("Jenis Izin      : " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin Keperluan Lain"));
                System.out.println("Durasi          : " + stack[i].durasi + " hari");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}
