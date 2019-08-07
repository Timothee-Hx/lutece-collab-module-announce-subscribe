package fr.paris.lutece.plugins.module.announce.subscribe.business;


import fr.paris.lutece.plugins.subscribe.business.SubscriptionFilter;
import fr.paris.lutece.portal.service.plugin.Plugin;

import java.util.Collection;
import java.util.List;

public interface IAnnounceSubscribtionDAO {
    /**
     * Insert a new record in the table.
     * @param subscription instance of the Subscription object to insert
     * @param plugin the Plugin
     */
    void insert(AnnounceSubscribtionDTO subscription, Plugin plugin );

    /**
     * Update the record in the table
     * @param subscription the reference of the Subscription
     * @param plugin the Plugin
     */
    void store(AnnounceSubscribtionDTO subscription, Plugin plugin );

    /**
     * Delete a record from the table
     * @param nIdSubscription int identifier of the Subscription to delete
     * @param plugin the Plugin
     */
    void delete( int nIdSubscription, Plugin plugin );

    ///////////////////////////////////////////////////////////////////////////
    // Finders

    /**
     * Load the data from the table
     * @param nKey The identifier of the subscription
     * @param plugin the plugin
     * @return The instance of the subscription
     */
    AnnounceSubscribtionDTO load(int nKey, Plugin plugin );

    /**
     * Load the data of all the subscription objects and returns them as a
     * collection
     * @param plugin the plugin
     * @return The collection which contains the data of all the subscription
     *         objects
     */
    Collection<AnnounceSubscribtionDTO> selectSubscriptionsList(Plugin plugin );

    /**
     * Find a list of subscriptions from a filter
     * @param filter The filter
     * @return The list of subscriptions that matches the given filter
     */
    List<AnnounceSubscribtionDTO> findByFilter(SubscriptionFilter filter );

    List<AnnounceSubscribtionDTO> findByFilterOr(String userId, String categoryId, String limitRows );

}
