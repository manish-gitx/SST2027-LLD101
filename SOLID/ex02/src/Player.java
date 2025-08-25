public class Player implements IPlayer
{
	private IFrame last;

	@Override
	public void play(byte[] fileBytes)
	{
		last = decodeFrame(fileBytes);
		drawUI(fileBytes);
		cacheFrame();
	}

	private IFrame decodeFrame(byte[] fileBytes)
	{
		return new Frame(fileBytes);
	}

	private void drawUI(byte[] fileBytes)
	{
		System.out.println("Now playing file with " + fileBytes.length + " bytes");
	}

	private void cacheFrame()
	{
		System.out.println("Frame cached successfully: " + (last != null));
	}
}