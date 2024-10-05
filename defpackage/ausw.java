package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ausw extends aonm implements aooz {
    public static final ausw a;
    private static volatile aopf m;
    public int b;
    public araz c;
    public arcz d;
    public arfa e;
    public avvq f;
    public ausi g;
    public aush h;
    public arfc i;
    public atdn j;
    public avpj k;
    public avre l;
    private byte n = 2;

    static {
        ausw auswVar = new ausw();
        a = auswVar;
        aonm.registerDefaultInstance(ausw.class, auswVar);
    }

    private ausw() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\ue7ecᢆ\ue675匹\n\u0000\u0000\n\ue7ecᢆᐉ\u0002﵂ᢳᐉ\u0001\uf2b9᪇ᐉ\u0004\uf3e7ᮦᐉ\u0003\ue592᯦ᐉ\u0007\uf859᱂ᐉ\u0005\uf8a7᱂ᐉ\u0006﮼\u1f4fᐉ\u0000\uf36b㢨ᐉ\t\ue675匹ᐉ\b", new Object[]{"b", "e", "d", "g", "f", "j", "h", "i", "c", "l", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new ausw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (ausw.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
