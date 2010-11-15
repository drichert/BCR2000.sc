BCR2000 {
  var controls;

  init {
    this.createConrols;
    this.createCCResponders;
  }
}
  createControls {  
    // 108 controls; index 0 is left unused
    // so that index number corresponds to 
    // MIDI CC number
    this.controls = Array.fill(109, {|n|
      // Don't create a bus for 0       
      if(n > 0, { 
        this.controls[n] = Bus.control(s) 
      });
    });
  }

  createCCResponders {
    CCResponder({|src, chan, num, val|
      [src, chan, num, val].postln;
      this.controls[num].set(val / 127);
    },
      // Adjust values as/if needed
      nil, // src
      nil, // chan
      nil, // num
      nil  // value    
    )
  }
}



