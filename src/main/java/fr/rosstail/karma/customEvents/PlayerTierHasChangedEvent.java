package fr.rosstail.karma.customEvents;

import fr.rosstail.karma.tiers.Tier;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class PlayerTierHasChangedEvent extends Event {
    private static final HandlerList handlers = new HandlerList();

    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    private Player player;
    private Tier tier;

    public PlayerTierHasChangedEvent(Player player, Tier tier) {
        this.player = player;
        this.tier = tier;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setTier(Tier tier) {
        this.tier = tier;
    }

    public Player getPlayer() {
        return player;
    }

    public Tier getTier() {
        return tier;
    }
}
