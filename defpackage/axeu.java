package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axeu extends aonm implements aooz {
    public static final aonv a = new atpn(13);
    public static final axeu b;
    private static volatile aopf k;
    public int c;
    public axew d;
    public int h;
    public axev j;
    private byte l = 2;
    public String e = "";
    public aonu f = emptyIntList();
    public String g = "";
    public String i = "";

    static {
        axeu axeuVar = new axeu();
        b = axeuVar;
        aonm.registerDefaultInstance(axeu.class, axeuVar);
    }

    private axeu() {
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
                return newMessageInfo(b, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0002\u0001ᐉ\u0000\u0002ဈ\u0001\u0003,\u0004ဈ\u0002\u0005င\u0003\u0006ဈ\u0004\u0007ᐉ\u0005", new Object[]{"c", "d", "e", "f", autl.a(), "g", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new axeu();
            case NEW_BUILDER:
                return new aone((short[]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return b;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (axeu.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(b);
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
