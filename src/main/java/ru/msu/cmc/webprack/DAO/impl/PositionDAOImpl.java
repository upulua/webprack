package ru.msu.cmc.webprack.DAO.impl;

import ru.msu.cmc.webprack.DAO.PositionDAO;
import ru.msu.cmc.webprack.models.Position;

public class PositionDAOImpl extends CommonDAOImpl<Position, Long> implements PositionDAO {
    public PositionDAOImpl() {
        super(Position.class);
    }
}
