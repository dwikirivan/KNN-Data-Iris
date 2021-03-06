/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodeManhattan;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        IrisFile irisFile = new IrisFile("iris.txt");

        List<Iris> irisDataset = irisFile.getIrisDataList();
        IrisAlgoritma irisKnn = new IrisAlgoritma();

//        MetodeManhattan.Iris newIris = new MetodeManhattan.Iris(3.1,3.2,1.1,5.2,null);    // Tes 1
// MetodeManhattan.Iris newIris = new MetodeManhattan.Iris(1.1,2.4,5.4,5.2,null);    // Tes 2
// MetodeManhattan.Iris newIris = new MetodeManhattan.Iris(4.4,9.1,1.3,0.9,null);    // Tes 3
// MetodeManhattan.Iris newIris = new MetodeManhattan.Iris(5.0,3.7,4.3,1.3,null);    // Tes 4
// MetodeManhattan.Iris newIris = new MetodeManhattan.Iris(5.9,3.2,4.8,1.8,null);    // Tes 5
//    MetodeManhattan.Iris newIris = new MetodeManhattan.Iris(2.9,8.1,2.2,1.6,null);    // Tes 6
//    MetodeManhattan.Iris newIris = new MetodeManhattan.Iris(5.1,8.1,3.0,1.2,null);    // Tes 7
//    MetodeManhattan.Iris newIris = new MetodeManhattan.Iris(6.9,1.4,5.8,7.0,null);    // Tes 8
//    MetodeManhattan.Iris newIris = new MetodeManhattan.Iris(3.5,1.4,1.2,2.5,null);    // Tes 9
    MetodeManhattan.Iris newIris = new MetodeManhattan.Iris(7.0,5.6,6.1,5.1,null);    // Tes 10
        
        newIris.setIrisType(irisKnn.getIrisType(3, irisDataset, newIris));
        System.out.println("Hasil Data Shet Bunga Iris:");
        System.out.println(newIris.toString());

    }
}
