package com.turtleplayer.model;

/**
 * Created by elizabeth on 11/2/14.
 */

import com.turtleplayer.util.Shorty;

public class SpeedDigest implements Speed
{

    private static final String EMPTY_REPLACMENT= "Unknown";
    private String id;

    public SpeedDigest(String id)
    {
        this.id = id;
    }

    public String getSpeedId()
    {
        return id;
    }

    public void setSpeedId(String id)
    {
        if (id.equals("slow")) {
            this.id = id;
        } else if (id.equals("fast")) {
            this.id = id;
        }
    }

    public String getSpeedName()
    {
        return Shorty.isVoid(id) ? EMPTY_REPLACMENT : id;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof SpeedDigest)) return false;

        SpeedDigest that = (SpeedDigest) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        return id != null ? id.hashCode() : 0;
    }

    public <R> R accept(InstanceVisitor<R> visitor)
    {
        return visitor.visit(this);
    }
}
