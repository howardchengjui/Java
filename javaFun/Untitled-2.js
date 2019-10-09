// let students = [
//     {name: 'Remy', cohort: 'Jan'},
//     {name: 'Genevieve', cohort: 'March'},
//     {name: 'Chuck', cohort: 'Jan'},
//     {name: 'Osmund', cohort: 'June'},
//     {name: 'Nikki', cohort: 'June'},
//     {name: 'Boris', cohort: 'June'}
// ];

// function printstudents(arr){
//     for (i=0;i<arr.length;i++){
//          console.log("Name:"+arr[i].name, "Cohort:"+arr[i].cohort);
//       }
//   }
                                
//        printstudents(students);

       let users = {
        employees: [
            {'first_name':  'Miguel', 'last_name' : 'Jones'},
            {'first_name' : 'Ernie', 'last_name' : 'Bertson'},
            {'first_name' : 'Nora', 'last_name' : 'Lu'},
            {'first_name' : 'Sally', 'last_name' : 'Barkyoumb'}
        ],
        managers: [
           {'first_name' : 'Lillian', 'last_name' : 'Chambers'},
           {'first_name' : 'Gordon', 'last_name' : 'Poe'}
        ]
     };
    
    function printall(objects){
    for (object in objects){
      for(i=0;i<object.length;i++){
        console.log(i+1+"-"+object.employees[i].last_name+","+object.employees[i].first_name+"-"+employees[i].last_name.size()+employees[i].first_name.size())
        
      }
    }
}
    printall(users);