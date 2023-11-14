package de.ait.homework22;


public class TestDedSynVnuk {
    public static void main(String[] args) {
        grandfather ded = new grandfather();
        Papa papa = new Papa();
        grandson grandson = new grandson();


        //vnuk.карманныеДеньги(ded.карманныеДеньги()); // 100€ <<-Так не делать
        grandson.PocketMoney(papa.PocketMoney()); // 50€

        System.out.println(grandson.PocketMoney());



    }
}

