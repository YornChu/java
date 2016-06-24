class Assembler
{
	public static void main(String [] args)
	{
		MainBoard mb=new MainBoard();
		NetworkCard nc=new NetworkCard();
		mb.usePCICard(nc);
		SoundCard sc=new SoundCard();
		mb.usePCICard(sc);
	}
}
