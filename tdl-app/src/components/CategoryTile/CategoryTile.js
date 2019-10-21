import React from 'react';

import { makeStyles } from '@material-ui/core/styles';
import { GridList, GridListTile, GridListTileBar, ButtonBase } from '@material-ui/core';
import { Link } from "react-router-dom";

const useStyles = makeStyles(theme => ({
    root: {
      display: 'flex',
      flexWrap: 'wrap',
      justifyContent: 'space-around',
      overflow: 'hidden',
      backgroundColor: theme.palette.background.paper,
    },
    gridList: {
      width: 1000,
      height: 'auto',
    },
    image: {
        position: 'relative',
        height: 200,
        [theme.breakpoints.down('xs')]: {
          width: '100% !important', // Overrides inline-style
          height: 100,
        },
        '&:hover, &$focusVisible': {
          zIndex: 1,
          '& $imageBackdrop': {
            opacity: 0.15,
          },
          '& $imageMarked': {
            opacity: 0,
          },
          '& $imageTitle': {
            border: '4px solid currentColor',
          },
        },
      },
      focusVisible: {},
      imageButton: {
        position: 'absolute',
        left: 0,
        right: 0,
        top: 0,
        bottom: 0,
        display: 'flex',
        alignItems: 'center',
        justifyContent: 'center',
        color: theme.palette.common.white,
      },
      imageSrc: {
        position: 'absolute',
        left: 0,
        right: 0,
        top: 0,
        bottom: 0,
        backgroundSize: 'cover',
        backgroundPosition: 'center 40%',
      },
      imageBackdrop: {
        position: 'absolute',
        left: 0,
        right: 0,
        top: 0,
        bottom: 0,
        backgroundColor: theme.palette.common.black,
        opacity: 0.4,
        transition: theme.transitions.create('opacity'),
      },
      imageTitle: {
        position: 'relative',
        padding: `${theme.spacing(2)}px ${theme.spacing(4)}px ${theme.spacing(1) + 6}px`,
      },
      imageMarked: {
        height: 3,
        width: 18,
        backgroundColor: theme.palette.common.white,
        position: 'absolute',
        bottom: -2,
        left: 'calc(50% - 9px)',
        transition: theme.transitions.create('opacity'),
      },
  }));

export const CategoryTile = () => {
    const tileData = [
        {
            img: 'https://ichef.bbci.co.uk/food/ic/food_16x9_832/recipes/salted_dark_chocolate_16338_16x9.jpg',
            title: 'Cake',
            cols: 2,
        },
        {
            img: 'https://images-gmi-pmc.edge-generalmills.com/983f0c5a-2b13-40db-8c92-748b279bcc3f.jpg',
            title: 'Cookies',
            cols: 1,
        },
        {
            img: 'https://keyassets-p2.timeincuk.net/wp/prod/wp-content/uploads/sites/53/2012/10/Multicoloured-macaroons.jpg',
            title: 'Macaroons',
            cols: 1,
        },
        {
            img: 'https://nowtoronto.com/downloads/101749/download/brown_sugar_horizontal.jpg?cb=fb860bfcd400e392c401193f54fb32e1&w=640',
            title: 'Bubble Tea',
            cols: 2,
        },
    ];
    const classes = useStyles();
    const CollisionLink = React.forwardRef((props, ref) => (
        <Link
          innerRef={ref}
          to={{
            pathname: "/products",
          }}
          {...props}
        />
      ));
    return (
        <div className={classes.root}>
            <GridList cellHeight={250} className={classes.gridList} cols={2}>
                {tileData.map(tile => (
                <GridListTile key={tile.img} cols={tile.cols || 1}>
                    <ButtonBase focusRipple component={CollisionLink} className={classes.image} focusVisibleClassName={classes.focusVisible}>
                        <img src={tile.img} alt={tile.title} />
                        {/* <GridListTileBar title={tile.title}/> */}
                    </ButtonBase>
                </GridListTile>
                ))}
            </GridList>
        </div>
    );
};

export default CategoryTile;
