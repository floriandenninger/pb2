package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqpk extends aonm implements aooz {
    public static final aqpk a;
    private static volatile aopf i;
    public int b;
    public Object d;
    public aqyg e;
    public arfs f;
    public aqyg g;
    public boolean h;
    private apxf j;
    private aqyg k;
    public int c = 0;
    private byte l = 2;

    static {
        aqpk aqpkVar = new aqpk();
        a = aqpkVar;
        aonm.registerDefaultInstance(aqpk.class, aqpkVar);
    }

    private aqpk() {
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
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0001\n\b\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004့\u0000\u0005ျ\u0000\u0006ဇ\u0005\tᐉ\b\nᐉ\t", new Object[]{"d", "c", "b", "e", "f", "g", "h", "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aqpk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aqpk.class) {
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
