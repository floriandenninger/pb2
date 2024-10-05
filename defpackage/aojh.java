package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aojh extends aonm implements aooz {
    public static final aojh a;
    private static volatile aopf i;
    public int b;
    public int c;
    public String d = "";
    public aojt e;
    public aojr f;
    public aojn g;
    public aoko h;

    static {
        aojh aojhVar = new aojh();
        a = aojhVar;
        aonm.registerDefaultInstance(aojh.class, aojhVar);
    }

    private aojh() {
        aonm.emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0005ဉ\u0002\u0006ဉ\u0003\u0007ဉ\u0004\nဌ\u0000\fဉ\u0005", new Object[]{"b", "d", "e", "f", "g", "c", aokm.b(), "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aojh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aojh.class) {
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
