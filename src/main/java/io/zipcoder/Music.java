//An array of n strings, songs, where the value of each element si corresponds to the song
// at index i in the playlist (where 0 ≤ i < n). An integer, k, the index of song sk.
// A string, q, the name of the song you wish to switch to.
// It must return an integer denoting the minimum number of button presses needed to switch from
// song sk to song q.
package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        String startSong = playList[startIndex];
        Integer btnPress = 0;
        for (int i = startIndex; i < playList.length-1; i++) {
            if (playList[i] != selection) {
                btnPress = btnPress+1;
            } else {
                return btnPress;
            }

                if (startSong == playList[0]) {
                    playList[playList.length - 1].equals(selection);
                    btnPress = 1;
                }
            }
        return btnPress;
    }

    //   Another way of doing the selection method

//    public Integer selection(Integer startIndex, String selection){
//        int i =startIndex;
//        int countUp=0;
//        int countDown=0;
//        while (playList[i]!=selection){
//            i++;
//            countUp++;
//            if(i == playList.length){i=0;}
//        }
//        i=startIndex;
//        while (playList[i]!=selection){
//            i--;
//            countDown++;
//            if(i == -1){i=playList.length-1;}
//        }
//
//        if(countDown<countUp){
//            return countDown;
//        } else return countUp;
//    }
}
