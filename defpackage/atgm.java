package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atgm extends aonm implements aooz {
    public static final atgm a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atgm atgmVar = new atgm();
        a = atgmVar;
        aonm.registerDefaultInstance(atgm.class, atgmVar);
    }

    private atgm() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\ueb11ἑﱖ\uab1f\u0005\u0000\u0000\u0004\ueb11ἑᐼ\u0000ﴌ㦜ᐼ\u0000\uebde馑ᐼ\u0000\ue123鶿ြ\u0000ﱖ\uab1fᐼ\u0000", new Object[]{"c", "b", apmg.class, aths.class, avhz.class, avia.class, arfm.class});
            case NEW_MUTABLE_INSTANCE:
                return new atgm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atgm.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
