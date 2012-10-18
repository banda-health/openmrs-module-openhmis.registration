// Set up onchange event for age fields (years and months) to calculate an estimated birth date
document.getElementById('age-years').onchange = function() {
    updateBirthDateFromAge();
}
document.getElementById('age-months').onchange = function() {
    updateBirthDateFromAge();
}

// Set up onchange event for estimated checkbox to clear age fields for an exact birth date
document.getElementById('birth-date-estimated').onchange = function() {
    if (this.childNodes[0].checked === false) {
        document.getElementById('age-years').value = "";
        document.getElementById('age-months').value = "";
    }
}

// Function to calculate an estimated birth date from age in years/months
function updateBirthDateFromAge() {
    var form_years = document.getElementById('age-years').value;
    var form_months = document.getElementById('age-months').value;
    var years = form_years ? form_years : 0;
    var months = form_months ? form_months : 0;
    var today = new Date();
    var estimatedDate = new Date(
        today.getFullYear() - years,
        today.getMonth() - months,
        today.getDate(),
        0, 0, 0, 0
    );
    var strDate = estimatedDate.getDate() + '/' +
        (estimatedDate.getMonth() + 1) + '/' +
        estimatedDate.getFullYear();
    document.getElementById('birth-date').value = strDate;
    document.getElementById('birth-date-estimated').childNodes[0].checked = true;
}