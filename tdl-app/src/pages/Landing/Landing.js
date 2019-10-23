import React from 'react';

import { Grid } from '@material-ui/core';
import CategoryTile from '../../components/CategoryTile/CategoryTile';
import ApplicationBar from '../../components/ApplicationBar/ApplicationBar';


const Landing = () => {
    return (
        <div>
            <ApplicationBar/>
            <Grid
            container
            spacing={0}
            direction="column"
            alignItems="center"
            justify="center"
            style={{ minHeight: '90vh' }}
            >
                <Grid item xs={4}>
                    <CategoryTile/>
                </Grid>   
            </Grid>
        </div>
    );
};

export default Landing;
