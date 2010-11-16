BCR2000 {
  var controls,
      responders
  ;

  *new {
    ^super.new.init;
  }
    
  init {
    controls = Dictionary.new(108);
    this.createCCResponders;
  }

  createCCResponders {
    responders = Array.fill(108, {|i|
      CCResponder({|src, chan, num, val|
        // [src, chan, num, val].postln;
        controls.put(i + 1, val);
      },
        // Adjust values as/if needed
        nil, // src
        nil, // chan
        nil, // num
        nil  // value    
      )
    });
  }

  at {arg controlNum;
    ^controls.at(controlNum)
  }

  scalarAt {arg controlNum; 
    ^controls.at(controlNum) / 127
  }
}

/* Scratch
Dictionary
b = BCR2000();
b.at(4);
b.scalarAt(4);
b.controls[5].get;
throw

Array.fill(10, {|i| i.postln;})
(2 + 3).asSymbol;
*/


