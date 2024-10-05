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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand extends aonm implements aooz {
    public static final GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand a;
    private static volatile aopf b;
    public static final aonk getSuggestedPlaylistVideosCommand;

    static {
        GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand = new GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand();
        a = getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand;
        aonm.registerDefaultInstance(GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.class, getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand);
        getSuggestedPlaylistVideosCommand = aonm.newSingularGeneratedExtension(apxf.a, getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand, getSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand, null, 229815794, aoqn.MESSAGE, GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.class);
    }

    private GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand() {
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
                return new GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (GetSuggestedPlaylistVideosCommandOuterClass$GetSuggestedPlaylistVideosCommand.class) {
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
