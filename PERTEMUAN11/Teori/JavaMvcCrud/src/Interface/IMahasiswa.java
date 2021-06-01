/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Models.*;
import java.util.List;

/**
 *
 * @author nothing
 */
public interface IMahasiswa {
        public void insert(Mahasiswa mhs);
        public void update(Mahasiswa mhs);
        public void delete(int id);
        public List<Mahasiswa>getAll();
        public List<Mahasiswa>getCariNama(String nama);
}
