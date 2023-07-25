package io.getarrays.server.repo;

import io.getarrays.server.enumeration.Status;
import io.getarrays.server.model.Server;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration(classes = {ServerRepo.class})
@EnableAutoConfiguration
@EntityScan(basePackages = {"io.getarrays.server.model"})
@DataJpaTest
class ServerRepoTest {
    @Autowired
    private ServerRepo serverRepo;

    /**
     * Method under test: {@link ServerRepo#findByIpAddress(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testFindByIpAddress() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.springframework.dao.InvalidDataAccessResourceUsageException: error performing isolated work; SQL [n/a]; nested exception is org.hibernate.exception.SQLGrammarException: error performing isolated work
        //       at jdk.proxy4.$Proxy102.save(null)
        //   org.hibernate.exception.SQLGrammarException: error performing isolated work
        //       at org.hibernate.exception.internal.SQLExceptionTypeDelegate.convert(SQLExceptionTypeDelegate.java:63)
        //       at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:42)
        //       at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:113)
        //       at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:99)
        //       at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:79)
        //       at org.hibernate.id.enhanced.TableStructure$1.getNextValue(TableStructure.java:125)
        //       at org.hibernate.id.enhanced.NoopOptimizer.generate(NoopOptimizer.java:40)
        //       at org.hibernate.id.enhanced.SequenceStyleGenerator.generate(SequenceStyleGenerator.java:523)
        //       at org.hibernate.event.internal.AbstractSaveEventListener.saveWithGeneratedId(AbstractSaveEventListener.java:115)
        //       at org.hibernate.event.internal.DefaultPersistEventListener.entityIsTransient(DefaultPersistEventListener.java:185)
        //       at org.hibernate.event.internal.DefaultPersistEventListener.onPersist(DefaultPersistEventListener.java:128)
        //       at org.hibernate.event.internal.DefaultPersistEventListener.onPersist(DefaultPersistEventListener.java:55)
        //       at org.hibernate.event.service.internal.EventListenerGroupImpl.fireEventOnEachListener(EventListenerGroupImpl.java:99)
        //       at org.hibernate.internal.SessionImpl.firePersist(SessionImpl.java:720)
        //       at org.hibernate.internal.SessionImpl.persist(SessionImpl.java:706)
        //       at jdk.proxy4.$Proxy99.persist(null)
        //       at jdk.proxy4.$Proxy102.save(null)
        //   org.h2.jdbc.JdbcSQLSyntaxErrorException: Table "HIBERNATE_SEQUENCE" not found; SQL statement:
        //   select next_val as id_val from hibernate_sequence for update [42102-200]
        //       at org.h2.message.DbException.getJdbcSQLException(DbException.java:453)
        //       at org.h2.message.DbException.getJdbcSQLException(DbException.java:429)
        //       at org.h2.message.DbException.get(DbException.java:205)
        //       at org.h2.message.DbException.get(DbException.java:181)
        //       at org.h2.command.Parser.readTableOrView(Parser.java:7628)
        //       at org.h2.command.Parser.readTableFilter(Parser.java:1970)
        //       at org.h2.command.Parser.parseSelectFromPart(Parser.java:2827)
        //       at org.h2.command.Parser.parseSelect(Parser.java:2959)
        //       at org.h2.command.Parser.parseQuerySub(Parser.java:2817)
        //       at org.h2.command.Parser.parseSelectUnion(Parser.java:2649)
        //       at org.h2.command.Parser.parseQuery(Parser.java:2620)
        //       at org.h2.command.Parser.parsePrepared(Parser.java:868)
        //       at org.h2.command.Parser.parse(Parser.java:843)
        //       at org.h2.command.Parser.parse(Parser.java:815)
        //       at org.h2.command.Parser.prepareCommand(Parser.java:738)
        //       at org.h2.engine.Session.prepareLocal(Session.java:657)
        //       at org.h2.engine.Session.prepareCommand(Session.java:595)
        //       at org.h2.jdbc.JdbcConnection.prepareCommand(JdbcConnection.java:1235)
        //       at org.h2.jdbc.JdbcPreparedStatement.<init>(JdbcPreparedStatement.java:76)
        //       at org.h2.jdbc.JdbcConnection.prepareStatement(JdbcConnection.java:352)
        //       at org.hibernate.id.enhanced.TableStructure.prepareStatement(TableStructure.java:195)
        //       at org.hibernate.id.enhanced.TableStructure.access$200(TableStructure.java:46)
        //       at org.hibernate.id.enhanced.TableStructure$1$1.execute(TableStructure.java:132)
        //       at org.hibernate.id.enhanced.TableStructure$1$1.execute(TableStructure.java:126)
        //       at org.hibernate.jdbc.WorkExecutor.executeReturningWork(WorkExecutor.java:55)
        //       at org.hibernate.jdbc.AbstractReturningWork.accept(AbstractReturningWork.java:34)
        //       at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:57)
        //       at org.hibernate.id.enhanced.TableStructure$1.getNextValue(TableStructure.java:125)
        //       at org.hibernate.id.enhanced.NoopOptimizer.generate(NoopOptimizer.java:40)
        //       at org.hibernate.id.enhanced.SequenceStyleGenerator.generate(SequenceStyleGenerator.java:523)
        //       at org.hibernate.event.internal.AbstractSaveEventListener.saveWithGeneratedId(AbstractSaveEventListener.java:115)
        //       at org.hibernate.event.internal.DefaultPersistEventListener.entityIsTransient(DefaultPersistEventListener.java:185)
        //       at org.hibernate.event.internal.DefaultPersistEventListener.onPersist(DefaultPersistEventListener.java:128)
        //       at org.hibernate.event.internal.DefaultPersistEventListener.onPersist(DefaultPersistEventListener.java:55)
        //       at org.hibernate.event.service.internal.EventListenerGroupImpl.fireEventOnEachListener(EventListenerGroupImpl.java:99)
        //       at org.hibernate.internal.SessionImpl.firePersist(SessionImpl.java:720)
        //       at org.hibernate.internal.SessionImpl.persist(SessionImpl.java:706)
        //       at jdk.proxy4.$Proxy99.persist(null)
        //       at jdk.proxy4.$Proxy102.save(null)
        //   See https://diff.blue/R013 to resolve this issue.

        Server server = new Server();
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");
        serverRepo.save(server);

        Server server2 = new Server();
        server2.setImageUrl("Image Url");
        server2.setIpAddress("17 High St");
        server2.setMemory("io.getarrays.server.model.Server");
        server2.setName("io.getarrays.server.model.Server");
        server2.setStatus(Status.SERVER_DOWN);
        server2.setType("io.getarrays.server.model.Server");
        serverRepo.save(server2);
        serverRepo.findByIpAddress("foo");
    }
}

