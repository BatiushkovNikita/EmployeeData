function sortColumn(param) {
    var orderFirstName = 0;
    var orderLastName = 0;
    if (param == 'firstName') {
        if (orderFirstName == 0) {
            $('.table').tablesorter({sortList: [[0,0]]})
        } else {
            $('.table').tablesorter({sortList: [[0,1]]})
            orderFirstName = 1;
        }
    } else if (param == 'lastName') {
        if (orderLastName == 0) {
            $('.table').tablesorter({sortList: [[1,0]]})
        } else {
            $('.table').tablesorter({sortList: [[1,1]]})
            orderLastName = 1;
        }
    }
}

