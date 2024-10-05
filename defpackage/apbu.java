package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apbu extends aonm implements aooz {
    public static final apbu a;
    private static volatile aopf i;
    public int b;
    public boolean e;
    public apxf f;
    public boolean g;
    private aota j;
    private byte k = 2;
    public String c = "";
    public String d = "";
    public aomf h = aomf.b;

    static {
        apbu apbuVar = new apbu();
        a = apbuVar;
        aonm.registerDefaultInstance(apbu.class, apbuVar);
    }

    private apbu() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0002\u0001ဈ\u0001\u0002ᐉ\u0005\u0003ည\u0006\u0004ဈ\u0000\u0005ᐉ\u0003\u0006ဇ\u0004\u0007ဇ\u0002", new Object[]{"b", "d", "j", "h", "c", "f", "g", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apbu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (apbu.class) {
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
