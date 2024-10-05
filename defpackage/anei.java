package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anei extends aonm implements aooz {
    public static final anei a;
    private static volatile aopf i;
    public int b;
    public aony c = emptyProtobufList();
    public aonx d = emptyLongList();
    public aonx e = emptyLongList();
    public long f;
    public long g;
    public int h;

    static {
        anei aneiVar = new anei();
        a = aneiVar;
        aonm.registerDefaultInstance(anei.class, aneiVar);
    }

    private anei() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0000\u0001\u001b\u0002\u0015\u0003\u0015\u0004ဃ\u0000\u0005ဃ\u0001\u0006င\u0002", new Object[]{"b", "c", andw.class, "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new anei();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (anei.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
