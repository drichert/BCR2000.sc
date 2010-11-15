BCR2000 {
  /*
  getPortNum {
    MIDIClient.sources.do({arg device, device_num;
      if (device.name.matchRegexp("BCR2000"),
          { ^device_num }
      )
    });
    return nil
  }
*/
  getPortNum {
    ^MIDIClient.sources
  }
}

MIDIClient.sources[4].device
MIDIEndPoint
String

Array
