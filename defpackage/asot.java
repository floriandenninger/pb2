package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asot extends aonm implements aooz {
    public static final asot a;
    private static volatile aopf l;
    public int b;
    public aulq d;
    public aulq e;
    public boolean f;
    public String g;
    public apxf h;
    public apxf i;
    public boolean j;
    public int k;
    private byte m = 2;
    public String c = "";

    static {
        asot asotVar = new asot();
        a = asotVar;
        aonm.registerDefaultInstance(asot.class, asotVar);
    }

    private asot() {
        emptyProtobufList();
        this.g = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0004\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ဈ\u0000\u0005ဇ\u0003\u0006ဈ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tဇ\u0007\nဌ\b", new Object[]{"b", "d", "e", "c", "f", "g", "h", "i", "j", "k", asje.q});
            case NEW_MUTABLE_INSTANCE:
                return new asot();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (asot.class) {
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
