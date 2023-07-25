package io.getarrays.server.service.implementation;

import io.getarrays.server.enumeration.Status;
import io.getarrays.server.model.Server;
import io.getarrays.server.repo.ServerRepo;

import java.io.IOException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {ServerServiceImpl.class})
@ExtendWith(SpringExtension.class)
class ServerServiceImplTest {
    @MockBean
    private ServerRepo serverRepo;

    @Autowired
    private ServerServiceImpl serverServiceImpl;

    /**
     * Method under test: {@link ServerServiceImpl#create(Server)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreate() {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy23.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");
        serverServiceImpl.create(server);
    }

    /**
     * Method under test: {@link ServerServiceImpl#ping(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testPing() throws IOException {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy23.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        serverServiceImpl.ping("42 Main St");
    }

    /**
     * Method under test: {@link ServerServiceImpl#list(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testList() {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy23.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        serverServiceImpl.list(1);
    }

    /**
     * Method under test: {@link ServerServiceImpl#get(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGet() {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy23.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        serverServiceImpl.get(1L);
    }

    /**
     * Method under test: {@link ServerServiceImpl#update(Server)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testUpdate() {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy23.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        Server server = new Server();
        server.setId(1L);
        server.setImageUrl("https://example.org/example");
        server.setIpAddress("42 Main St");
        server.setMemory("Memory");
        server.setName("Name");
        server.setStatus(Status.SERVER_UP);
        server.setType("Type");
        serverServiceImpl.update(server);
    }

    /**
     * Method under test: {@link ServerServiceImpl#delete(Long)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDelete() {
        // TODO: Complete this test.
        //   Reason: R026 Failed to create Spring context.
        //   Attempt to initialize test context failed with
        //   java.lang.IllegalStateException: Failed to load ApplicationContext
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Could not initialize plugin: interface org.mockito.plugins.MockMaker (alternate: null)
        //       at org.mockito.internal.configuration.plugins.PluginLoader$1.invoke(PluginLoader.java:84)
        //       at jdk.proxy3.$Proxy23.isTypeMockable(null)
        //       at org.mockito.internal.util.MockUtil.typeMockabilityOf(MockUtil.java:78)
        //       at org.mockito.internal.util.MockCreationValidator.validateType(MockCreationValidator.java:22)
        //       at org.mockito.internal.creation.MockSettingsImpl.validatedSettings(MockSettingsImpl.java:267)
        //       at org.mockito.internal.creation.MockSettingsImpl.build(MockSettingsImpl.java:234)
        //       at org.mockito.internal.MockitoCore.mock(MockitoCore.java:86)
        //       at org.mockito.Mockito.mock(Mockito.java:2037)
        //       at java.util.Optional.map(Optional.java:260)
        //   java.lang.IllegalStateException: Internal problem occurred, please report it. Mockito is unable to load the default implementation of class that is a part of Mockito distribution. Failed to load interface org.mockito.plugins.MockMaker
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:97)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.reflect.InvocationTargetException
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   org.mockito.exceptions.base.MockitoInitializationException:
        //   It seems like you are running Mockito with an incomplete or inconsistent class path. Byte Buddy could not be loaded.
        //   Byte Buddy is available on Maven Central as 'net.bytebuddy:byte-buddy' with the module name 'net.bytebuddy'.
        //   For the inline mock maker, 'net.bytebuddy:byte-buddy-agent' with the module name 'net.bytebuddy.agent' is also required.
        //   Normally, your IDE or build tool (such as Maven or Gradle) should take care of your class path completion but
        //       at org.mockito.internal.exceptions.Reporter.missingByteBuddyDependency(Reporter.java:1131)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:31)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.NoClassDefFoundError: net/bytebuddy/utility/GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   java.lang.ClassNotFoundException: net.bytebuddy.utility.GraalImageCode
        //       at org.mockito.internal.creation.bytebuddy.SubclassInjectionLoader.<init>(SubclassInjectionLoader.java:34)
        //       at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.<init>(SubclassByteBuddyMockMaker.java:33)
        //       at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.<init>(ByteBuddyMockMaker.java:29)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.create(DefaultMockitoPlugins.java:95)
        //       at org.mockito.internal.configuration.plugins.DefaultMockitoPlugins.getDefaultPlugin(DefaultMockitoPlugins.java:71)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:75)
        //       at org.mockito.internal.configuration.plugins.PluginLoader.loadPlugin(PluginLoader.java:50)
        //       at org.mockito.internal.configuration.plugins.PluginRegistry.<init>(PluginRegistry.java:27)
        //       at org.mockito.internal.configuration.plugins.Plugins.<clinit>(Plugins.java:22)
        //   See https://diff.blue/R026 to resolve this issue.

        serverServiceImpl.delete(1L);
    }
}

