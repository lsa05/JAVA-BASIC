package ch7;


class Tv2{
	boolean power;	//전원상태
	int channel;	//채널
	
	void power()		{power=!power;}
	void channelUp()	{++channel;}
	void channelDown()	{--channel;}
}

class VCR{
	boolean power; 	//전원상태
	int counter =0;
	void power() {power =!power;}
	void play()	{}
	void stop()	{}
	void rew()	{}
	void ff() 	{}
	
}

class TVCR extends Tv2{
	VCR vcr = new VCR();
	
	void play() {
		vcr.play();
	}
	
	void stop() {
		vcr.stop();
	}
	
	void rew() {
		vcr.rew();
	}
	
	void ff() {
		vcr.ff();
	}
	

	
	

}
