import React from 'react'
import { Card, Icon, Image} from 'semantic-ui-react'

const CardView = () => (
    <Card>
    <Image src= '' wrapped ui={false} />
    <Card.Content>
        <Card.Header></Card.Header>
        <Card.Meta>
            <span className='date'>Joined in : </span>
        </Card.Meta>
        <Card.Description>
            This is a placeholder description
        </Card.Description>
    </Card.Content>
    <Card.Content extra>
        <a>
            <Icon name='user' />
            something to say
        </a>
    </Card.Content>
    </Card>
)
export default CardView;