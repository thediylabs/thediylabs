import React from 'react';

import { AppBar, Toolbar, Typography } from '@material-ui/core';

const ApplicationBar = () => {
    return (
        <div>
            <AppBar position="static" style={{ background: 'transparent', boxShadow: 'none'}}>
                <Toolbar>
                    <Typography align="center" style={ { color: "#000" } }>The DIY Labs</Typography>
                </Toolbar>
            </AppBar>
        </div>
    );
};

export default ApplicationBar;
