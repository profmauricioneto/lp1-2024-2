function isNumber(input, message) {
  if (isNaN(input)) {
    window.alert(message);
    console.log(message);
  }
}

let setAlarm = setInterval(function () {
  var hour = document.getElementById("hour").value;
  isNumber(hour, "Hour value is not applicable!");
  var minutes = document.getElementById("minutes").value;
  isNumber(minutes, "Minutes value is not applicable!");
  var message = document.getElementById("message").value;
  if (new Date().getHours() == hour && new Date().getMinutes() == minutes) {
    document.getElementById("resultado").innerHTML = message;
    window.alert(message);
  }
}, 1000);

