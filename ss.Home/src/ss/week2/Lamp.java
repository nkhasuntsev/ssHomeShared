package ss.week2;

public class Lamp {
	
		private Setting setting;
		public enum Setting {OFF, LOW, MEDIUM, HIGH};
		
		//The lamp starts at the off state.
		public Lamp() {
			this.setting = Setting.OFF;
		}

		public void switchSetting() {
			switch(this.setting){
				case OFF:
					this.setting = Setting.LOW;
					break;
				case LOW:
					this.setting = Setting.MEDIUM;
					break;
				case MEDIUM:
					this.setting = Setting.HIGH;
					break;
				case HIGH:
					this.setting = Setting.OFF;
					break;
				default:
					this.setting = Setting.OFF;
					break;
					
				}
			}


		//Method getSetting returns the current state of the lamp
		
		//@ pure;
		public Setting getSetting() {
			return this.setting;
		}
	}
