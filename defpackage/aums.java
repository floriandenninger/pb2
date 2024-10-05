package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aums extends aonm implements aooz {
    public static final aums a;
    private static volatile aopf j;
    public int b;
    public int f;
    public int g;
    public apxf h;
    public apxf i;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public String e = "";

    static {
        aums aumsVar = new aums();
        a = aumsVar;
        aonm.registerDefaultInstance(aums.class, aumsVar);
    }

    private aums() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဌ\u0003\u0005င\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "e", "f", aukz.h, "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aums();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aums.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
