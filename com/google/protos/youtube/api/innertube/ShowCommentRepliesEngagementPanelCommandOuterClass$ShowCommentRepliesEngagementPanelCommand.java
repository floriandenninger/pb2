package com.google.protos.youtube.api.innertube;

import defpackage.aone;
import defpackage.aonf;
import defpackage.aonk;
import defpackage.aonl;
import defpackage.aonm;
import defpackage.aooz;
import defpackage.aopf;
import defpackage.aoqn;
import defpackage.apxf;
import defpackage.aqyg;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand extends aonm implements aooz {
    public static final ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand a;
    private static volatile aopf k;
    public static final aonk showCommentRepliesEngagementPanelCommand;
    public int b;
    public aqyg d;
    public boolean f;
    public aqyg g;
    public int h;
    public apxf j;
    private byte l = 2;
    public String c = "";
    public String e = "";
    public String i = "";

    static {
        ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand = new ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand();
        a = showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand;
        aonm.registerDefaultInstance(ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.class, showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand);
        showCommentRepliesEngagementPanelCommand = aonm.newSingularGeneratedExtension(apxf.a, showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand, showCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand, null, 141942083, aoqn.MESSAGE, ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.class);
    }

    private ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0003\u0001ဈ\u0000\u0002ဈ\u0002\u0003ᐉ\u0001\u0004ဇ\u0003\u0005ᐉ\u0004\u0006င\u0005\u0007ဈ\u0006\bᐉ\u0007", new Object[]{"b", "c", "e", "d", "f", "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (ShowCommentRepliesEngagementPanelCommandOuterClass$ShowCommentRepliesEngagementPanelCommand.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
