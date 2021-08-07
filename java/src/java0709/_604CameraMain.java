package java0709;

public class _604CameraMain {

	public static void main(String[] args) {
		_604Camera myCamera = new _604Camera();
		myCamera.maker = "Sony";
		myCamera.name = "RX100";
		myCamera.color = "black";
		myCamera.Meterial = "metal";
		myCamera.sensorSize = 1;
		myCamera.size = 5;
		myCamera.variety = "digital";
		
		myCamera.takePhotos();
		myCamera.savePhotos();
	}

}