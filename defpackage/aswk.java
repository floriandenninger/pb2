package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class aswk extends aonm implements aooz {
    public static final aswk a;
    private static volatile aopf e;
    public int b;
    public String c = "";
    public String d;

    static {
        aswk aswkVar = new aswk();
        a = aswkVar;
        aonm.registerDefaultInstance(aswk.class, aswkVar);
    }

    private aswk() {
        aomf aomfVar = aomf.b;
        this.d = "";
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aswk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aswk.class) {
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
