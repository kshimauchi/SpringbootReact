import React from 'react';
import axios from 'axios';
import CardView from './CardView';

class StudentList extends React.Component {
    state = {
        error: null,
        isLoaded: false,
        students:[]
    };
    componentDidMount(){
        axios.get('http://localhost:8081/api/v1/student')
            .then(
                result => {
                    this.setState({ 
                        isLoaded: true,
                        students: result.data
                    });
            })
            .catch(
                error => {
                    console.log(error.result.data);
            })  
    }
    render(){
        const { error, isLoaded, students }= this.state;
        if(error){
            return <div>Error: {error.message}</div>;
        }else if(!isLoaded){
            return <div>Loading...</div>;
        }else {
            return (
                
                <ul>
                   
                    {students.map(student => (
                        <li key={student.id}>
                        
                            { student.name }   { student.email }
                        
                        </li>
                    ))}
                </ul>
            );
        }
    }
}
export default StudentList;