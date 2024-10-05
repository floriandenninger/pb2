package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aony;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;
import defpackage.aqyg;
import defpackage.asol;
import defpackage.asom;
import defpackage.ason;
import defpackage.asoo;
import defpackage.aspl;
import defpackage.asrn;
import defpackage.aulq;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class LiveChatAction {
    public static final aonk replaceLiveChatRendererAction = aonm.newSingularGeneratedExtension(apxf.a, ason.a, ason.a, null, 167912809, aoqn.MESSAGE, ason.class);
    public static final aonk showLiveChatSurveyCommand = aonm.newSingularGeneratedExtension(apxf.a, asoo.a, asoo.a, null, 181233165, aoqn.MESSAGE, asoo.class);

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class AddChatItemAction extends aonm implements aooz {
        public static final AddChatItemAction a;
        public static final aonk addChatItemAction;
        private static volatile aopf f;
        public int b;
        public aspl c;
        public asom e;
        private byte g = 2;
        public String d = "";

        static {
            AddChatItemAction addChatItemAction2 = new AddChatItemAction();
            a = addChatItemAction2;
            aonm.registerDefaultInstance(AddChatItemAction.class, addChatItemAction2);
            addChatItemAction = aonm.newSingularGeneratedExtension(apxf.a, addChatItemAction2, addChatItemAction2, null, 117298952, aoqn.MESSAGE, AddChatItemAction.class);
        }

        private AddChatItemAction() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.g);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.g = obj == null ? (byte) 0 : (byte) 1;
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d", "e"});
                case NEW_MUTABLE_INSTANCE:
                    return new AddChatItemAction();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = f;
                    if (aopfVar == null) {
                        synchronized (AddChatItemAction.class) {
                            aopfVar = f;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                f = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class AddLiveChatTextMessageFromTemplateAction extends aonm implements aooz {
        public static final AddLiveChatTextMessageFromTemplateAction a;
        public static final aonk addLiveChatTextMessageFromTemplateAction;
        private static volatile aopf e;
        public int b;
        public asol c;
        public asom d;
        private byte f = 2;

        static {
            AddLiveChatTextMessageFromTemplateAction addLiveChatTextMessageFromTemplateAction2 = new AddLiveChatTextMessageFromTemplateAction();
            a = addLiveChatTextMessageFromTemplateAction2;
            aonm.registerDefaultInstance(AddLiveChatTextMessageFromTemplateAction.class, addLiveChatTextMessageFromTemplateAction2);
            addLiveChatTextMessageFromTemplateAction = aonm.newSingularGeneratedExtension(apxf.a, addLiveChatTextMessageFromTemplateAction2, addLiveChatTextMessageFromTemplateAction2, null, 126084307, aoqn.MESSAGE, AddLiveChatTextMessageFromTemplateAction.class);
        }

        private AddLiveChatTextMessageFromTemplateAction() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.f);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.f = obj == null ? (byte) 0 : (byte) 1;
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
                case NEW_MUTABLE_INSTANCE:
                    return new AddLiveChatTextMessageFromTemplateAction();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = e;
                    if (aopfVar == null) {
                        synchronized (AddLiveChatTextMessageFromTemplateAction.class) {
                            aopfVar = e;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                e = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class AddLiveChatTickerItemAction extends aonm implements aooz {
        public static final AddLiveChatTickerItemAction a;
        public static final aonk addLiveChatTickerItemAction;
        private static volatile aopf e;
        public int b;
        public asrn c;
        public long d;
        private byte f = 2;

        static {
            AddLiveChatTickerItemAction addLiveChatTickerItemAction2 = new AddLiveChatTickerItemAction();
            a = addLiveChatTickerItemAction2;
            aonm.registerDefaultInstance(AddLiveChatTickerItemAction.class, addLiveChatTickerItemAction2);
            addLiveChatTickerItemAction = aonm.newSingularGeneratedExtension(apxf.a, addLiveChatTickerItemAction2, addLiveChatTickerItemAction2, null, 132845915, aoqn.MESSAGE, AddLiveChatTickerItemAction.class);
        }

        private AddLiveChatTickerItemAction() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.f);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.f = obj == null ? (byte) 0 : (byte) 1;
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
                case NEW_MUTABLE_INSTANCE:
                    return new AddLiveChatTickerItemAction();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = e;
                    if (aopfVar == null) {
                        synchronized (AddLiveChatTickerItemAction.class) {
                            aopfVar = e;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                e = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class CancelVoteAction extends aonm implements aooz {
        public static final CancelVoteAction a;
        private static volatile aopf b;
        public static final aonk cancelVoteAction;

        static {
            CancelVoteAction cancelVoteAction2 = new CancelVoteAction();
            a = cancelVoteAction2;
            aonm.registerDefaultInstance(CancelVoteAction.class, cancelVoteAction2);
            cancelVoteAction = aonm.newSingularGeneratedExtension(apxf.a, cancelVoteAction2, cancelVoteAction2, null, 238715030, aoqn.MESSAGE, CancelVoteAction.class);
        }

        private CancelVoteAction() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0000", null);
                case NEW_MUTABLE_INSTANCE:
                    return new CancelVoteAction();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = b;
                    if (aopfVar == null) {
                        synchronized (CancelVoteAction.class) {
                            aopfVar = b;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                b = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class CloseLiveChatActionPanelAction extends aonm implements aooz {
        public static final CloseLiveChatActionPanelAction a;
        public static final aonk closeLiveChatActionPanelAction;
        private static volatile aopf f;
        public int b;
        public String c = "";
        public int d;
        public boolean e;

        static {
            CloseLiveChatActionPanelAction closeLiveChatActionPanelAction2 = new CloseLiveChatActionPanelAction();
            a = closeLiveChatActionPanelAction2;
            aonm.registerDefaultInstance(CloseLiveChatActionPanelAction.class, closeLiveChatActionPanelAction2);
            closeLiveChatActionPanelAction = aonm.newSingularGeneratedExtension(apxf.a, closeLiveChatActionPanelAction2, closeLiveChatActionPanelAction2, null, 240912718, aoqn.MESSAGE, CloseLiveChatActionPanelAction.class);
        }

        private CloseLiveChatActionPanelAction() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003င\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", "e"});
                case NEW_MUTABLE_INSTANCE:
                    return new CloseLiveChatActionPanelAction();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = f;
                    if (aopfVar == null) {
                        synchronized (CloseLiveChatActionPanelAction.class) {
                            aopfVar = f;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                f = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class DimChatItemAction extends aonm implements aooz {
        public static final DimChatItemAction a;
        private static volatile aopf c;
        public static final aonk dimChatItemAction;
        public String b = "";
        private int d;

        static {
            DimChatItemAction dimChatItemAction2 = new DimChatItemAction();
            a = dimChatItemAction2;
            aonm.registerDefaultInstance(DimChatItemAction.class, dimChatItemAction2);
            dimChatItemAction = aonm.newSingularGeneratedExtension(apxf.a, dimChatItemAction2, dimChatItemAction2, null, 136048375, aoqn.MESSAGE, DimChatItemAction.class);
        }

        private DimChatItemAction() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
                case NEW_MUTABLE_INSTANCE:
                    return new DimChatItemAction();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = c;
                    if (aopfVar == null) {
                        synchronized (DimChatItemAction.class) {
                            aopfVar = c;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                c = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class ForceLiveChatContinuationCommand extends aonm implements aooz {
        public static final ForceLiveChatContinuationCommand a;
        private static volatile aopf d;
        public static final aonk forceLiveChatContinuationCommand;
        public boolean b;
        public boolean c;
        private int e;

        static {
            ForceLiveChatContinuationCommand forceLiveChatContinuationCommand2 = new ForceLiveChatContinuationCommand();
            a = forceLiveChatContinuationCommand2;
            aonm.registerDefaultInstance(ForceLiveChatContinuationCommand.class, forceLiveChatContinuationCommand2);
            forceLiveChatContinuationCommand = aonm.newSingularGeneratedExtension(apxf.a, forceLiveChatContinuationCommand2, forceLiveChatContinuationCommand2, null, 220358198, aoqn.MESSAGE, ForceLiveChatContinuationCommand.class);
        }

        private ForceLiveChatContinuationCommand() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"e", "b", "c"});
                case NEW_MUTABLE_INSTANCE:
                    return new ForceLiveChatContinuationCommand();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = d;
                    if (aopfVar == null) {
                        synchronized (ForceLiveChatContinuationCommand.class) {
                            aopfVar = d;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                d = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class MarkChatItemAsDeletedAction extends aonm implements aooz {
        public static final MarkChatItemAsDeletedAction a;
        private static volatile aopf f;
        public static final aonk markChatItemAsDeletedAction;
        public int b;
        public aqyg c;
        public aqyg d;
        private byte g = 2;
        public String e = "";

        static {
            MarkChatItemAsDeletedAction markChatItemAsDeletedAction2 = new MarkChatItemAsDeletedAction();
            a = markChatItemAsDeletedAction2;
            aonm.registerDefaultInstance(MarkChatItemAsDeletedAction.class, markChatItemAsDeletedAction2);
            markChatItemAsDeletedAction = aonm.newSingularGeneratedExtension(apxf.a, markChatItemAsDeletedAction2, markChatItemAsDeletedAction2, null, 135377179, aoqn.MESSAGE, MarkChatItemAsDeletedAction.class);
        }

        private MarkChatItemAsDeletedAction() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.g);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.g = obj == null ? (byte) 0 : (byte) 1;
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0002\u0003ᐉ\u0001", new Object[]{"b", "c", "e", "d"});
                case NEW_MUTABLE_INSTANCE:
                    return new MarkChatItemAsDeletedAction();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = f;
                    if (aopfVar == null) {
                        synchronized (MarkChatItemAsDeletedAction.class) {
                            aopfVar = f;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                f = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class MarkChatItemsByAuthorAsDeletedAction extends aonm implements aooz {
        public static final MarkChatItemsByAuthorAsDeletedAction a;
        private static volatile aopf f;
        public static final aonk markChatItemsByAuthorAsDeletedAction;
        public int b;
        public aqyg c;
        public aqyg d;
        private byte g = 2;
        public String e = "";

        static {
            MarkChatItemsByAuthorAsDeletedAction markChatItemsByAuthorAsDeletedAction2 = new MarkChatItemsByAuthorAsDeletedAction();
            a = markChatItemsByAuthorAsDeletedAction2;
            aonm.registerDefaultInstance(MarkChatItemsByAuthorAsDeletedAction.class, markChatItemsByAuthorAsDeletedAction2);
            markChatItemsByAuthorAsDeletedAction = aonm.newSingularGeneratedExtension(apxf.a, markChatItemsByAuthorAsDeletedAction2, markChatItemsByAuthorAsDeletedAction2, null, 133968669, aoqn.MESSAGE, MarkChatItemsByAuthorAsDeletedAction.class);
        }

        private MarkChatItemsByAuthorAsDeletedAction() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.g);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.g = obj == null ? (byte) 0 : (byte) 1;
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဈ\u0002\u0003ᐉ\u0001", new Object[]{"b", "c", "e", "d"});
                case NEW_MUTABLE_INSTANCE:
                    return new MarkChatItemsByAuthorAsDeletedAction();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = f;
                    if (aopfVar == null) {
                        synchronized (MarkChatItemsByAuthorAsDeletedAction.class) {
                            aopfVar = f;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                f = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class RemoveChatItemAction extends aonm implements aooz {
        public static final RemoveChatItemAction a;
        private static volatile aopf c;
        public static final aonk removeChatItemAction;
        public String b = "";
        private int d;

        static {
            RemoveChatItemAction removeChatItemAction2 = new RemoveChatItemAction();
            a = removeChatItemAction2;
            aonm.registerDefaultInstance(RemoveChatItemAction.class, removeChatItemAction2);
            removeChatItemAction = aonm.newSingularGeneratedExtension(apxf.a, removeChatItemAction2, removeChatItemAction2, null, 130295727, aoqn.MESSAGE, RemoveChatItemAction.class);
        }

        private RemoveChatItemAction() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return (byte) 1;
                case SET_MEMOIZED_IS_INITIALIZED:
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "b"});
                case NEW_MUTABLE_INSTANCE:
                    return new RemoveChatItemAction();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = c;
                    if (aopfVar == null) {
                        synchronized (RemoveChatItemAction.class) {
                            aopfVar = c;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                c = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class ReplaceChatItemAction extends aonm implements aooz {
        public static final ReplaceChatItemAction a;
        private static volatile aopf d;
        public static final aonk replaceChatItemAction;
        public aspl c;
        private int e;
        private byte f = 2;
        public String b = "";

        static {
            ReplaceChatItemAction replaceChatItemAction2 = new ReplaceChatItemAction();
            a = replaceChatItemAction2;
            aonm.registerDefaultInstance(ReplaceChatItemAction.class, replaceChatItemAction2);
            replaceChatItemAction = aonm.newSingularGeneratedExtension(apxf.a, replaceChatItemAction2, replaceChatItemAction2, null, 149968475, aoqn.MESSAGE, ReplaceChatItemAction.class);
        }

        private ReplaceChatItemAction() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.f);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.f = obj == null ? (byte) 0 : (byte) 1;
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"e", "b", "c"});
                case NEW_MUTABLE_INSTANCE:
                    return new ReplaceChatItemAction();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = d;
                    if (aopfVar == null) {
                        synchronized (ReplaceChatItemAction.class) {
                            aopfVar = d;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                d = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class ReplayChatItemAction extends aonm implements aooz {
        public static final ReplayChatItemAction a;
        private static volatile aopf d;
        public static final aonk replayChatItemAction;
        public long c;
        private int e;
        private byte f = 2;
        public aony b = emptyProtobufList();

        static {
            ReplayChatItemAction replayChatItemAction2 = new ReplayChatItemAction();
            a = replayChatItemAction2;
            aonm.registerDefaultInstance(ReplayChatItemAction.class, replayChatItemAction2);
            replayChatItemAction = aonm.newSingularGeneratedExtension(apxf.a, replayChatItemAction2, replayChatItemAction2, null, 145132565, aoqn.MESSAGE, ReplayChatItemAction.class);
        }

        private ReplayChatItemAction() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.f);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.f = obj == null ? (byte) 0 : (byte) 1;
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဂ\u0000", new Object[]{"e", "b", apxf.class, "c"});
                case NEW_MUTABLE_INSTANCE:
                    return new ReplayChatItemAction();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = d;
                    if (aopfVar == null) {
                        synchronized (ReplayChatItemAction.class) {
                            aopfVar = d;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                d = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class ShowLiveChatActionPanelAction extends aonm implements aooz {
        public static final ShowLiveChatActionPanelAction a;
        private static volatile aopf d;
        public static final aonk showLiveChatActionPanelAction;
        public int b;
        public aulq c;
        private byte e = 2;

        static {
            ShowLiveChatActionPanelAction showLiveChatActionPanelAction2 = new ShowLiveChatActionPanelAction();
            a = showLiveChatActionPanelAction2;
            aonm.registerDefaultInstance(ShowLiveChatActionPanelAction.class, showLiveChatActionPanelAction2);
            showLiveChatActionPanelAction = aonm.newSingularGeneratedExtension(apxf.a, showLiveChatActionPanelAction2, showLiveChatActionPanelAction2, null, 238110852, aoqn.MESSAGE, ShowLiveChatActionPanelAction.class);
        }

        private ShowLiveChatActionPanelAction() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.e);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.e = obj == null ? (byte) 0 : (byte) 1;
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
                case NEW_MUTABLE_INSTANCE:
                    return new ShowLiveChatActionPanelAction();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = d;
                    if (aopfVar == null) {
                        synchronized (ShowLiveChatActionPanelAction.class) {
                            aopfVar = d;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                d = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class ShowLiveChatDialogAction extends aonm implements aooz {
        public static final ShowLiveChatDialogAction a;
        private static volatile aopf d;
        public static final aonk showLiveChatDialogAction;
        public int b;
        public aulq c;
        private byte e = 2;

        static {
            ShowLiveChatDialogAction showLiveChatDialogAction2 = new ShowLiveChatDialogAction();
            a = showLiveChatDialogAction2;
            aonm.registerDefaultInstance(ShowLiveChatDialogAction.class, showLiveChatDialogAction2);
            showLiveChatDialogAction = aonm.newSingularGeneratedExtension(apxf.a, showLiveChatDialogAction2, showLiveChatDialogAction2, null, 171299322, aoqn.MESSAGE, ShowLiveChatDialogAction.class);
        }

        private ShowLiveChatDialogAction() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.e);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.e = obj == null ? (byte) 0 : (byte) 1;
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
                case NEW_MUTABLE_INSTANCE:
                    return new ShowLiveChatDialogAction();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = d;
                    if (aopfVar == null) {
                        synchronized (ShowLiveChatDialogAction.class) {
                            aopfVar = d;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                d = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public final class UpdateLiveChatPollAction extends aonm implements aooz {
        public static final UpdateLiveChatPollAction a;
        private static volatile aopf d;
        public static final aonk updateLiveChatPollAction;
        public int b;
        public aulq c;
        private byte e = 2;

        static {
            UpdateLiveChatPollAction updateLiveChatPollAction2 = new UpdateLiveChatPollAction();
            a = updateLiveChatPollAction2;
            aonm.registerDefaultInstance(UpdateLiveChatPollAction.class, updateLiveChatPollAction2);
            updateLiveChatPollAction = aonm.newSingularGeneratedExtension(apxf.a, updateLiveChatPollAction2, updateLiveChatPollAction2, null, 239281785, aoqn.MESSAGE, UpdateLiveChatPollAction.class);
        }

        private UpdateLiveChatPollAction() {
        }

        @Override // defpackage.aonm
        protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
            aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
            switch (aonlVar) {
                case GET_MEMOIZED_IS_INITIALIZED:
                    return Byte.valueOf(this.e);
                case SET_MEMOIZED_IS_INITIALIZED:
                    this.e = obj == null ? (byte) 0 : (byte) 1;
                    return null;
                case BUILD_MESSAGE_INFO:
                    return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
                case NEW_MUTABLE_INSTANCE:
                    return new UpdateLiveChatPollAction();
                case NEW_BUILDER:
                    return new aone(a);
                case GET_DEFAULT_INSTANCE:
                    return a;
                case GET_PARSER:
                    aopf aopfVar = d;
                    if (aopfVar == null) {
                        synchronized (UpdateLiveChatPollAction.class) {
                            aopfVar = d;
                            if (aopfVar == null) {
                                aopfVar = new aonf(a);
                                d = aopfVar;
                            }
                        }
                    }
                    return aopfVar;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    private LiveChatAction() {
    }
}
