package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqxd extends aonm implements aooz {
    public static final aqxd a;
    private static volatile aopf h;
    public int b;
    public aulq d;
    public apxf g;
    private byte i = 2;
    public String c = "";
    public aony e = emptyProtobufList();
    public String f = "";

    static {
        aqxd aqxdVar = new aqxd();
        a = aqxdVar;
        aonm.registerDefaultInstance(aqxd.class, aqxdVar);
    }

    private aqxd() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003Л\u0004ဈ\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", "d", "e", aulq.class, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aqxd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aqxd.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
