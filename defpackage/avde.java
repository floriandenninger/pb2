package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avde extends aonm implements aooz {
    public static final avde a;
    private static volatile aopf l;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;
    public int g;
    public int j;
    public String h = "";
    public String i = "";
    public String k = "";

    static {
        avde avdeVar = new avde();
        a = avdeVar;
        aonm.registerDefaultInstance(avde.class, avdeVar);
    }

    private avde() {
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဂ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\nဈ\t", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new avde();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (avde.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
