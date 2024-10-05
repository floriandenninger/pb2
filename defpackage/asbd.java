package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asbd extends aonm implements aooz {
    public static final asbd a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        asbd asbdVar = new asbd();
        a = asbdVar;
        aonm.registerDefaultInstance(asbd.class, asbdVar);
    }

    private asbd() {
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
                return newMessageInfo(a, "\u0001\u0010\u0001\u0000拓ᵕ\ue857끞\u0010\u0000\u0000\u0010拓ᵕᐼ\u0000\ue6c6Ὺᐼ\u0000\uf006⢾ᐼ\u0000\uf1f8⨰ᐼ\u0000\uf5d9ⲵᐼ\u0000\uf792ⳬᐼ\u0000ﱙ㬷ᐼ\u0000\ue6d4䓥ᐼ\u0000\uf492䤳ᐼ\u0000\uec67䩗ᐼ\u0000\ue3db勁ᐼ\u0000\uea8e愮ᐼ\u0000\uf587淲ᐼ\u0000\ufe53髪ᐼ\u0000\uf2fcꭽᐼ\u0000\ue857끞ᐼ\u0000", new Object[]{"c", "b", aupx.class, aupv.class, aupl.class, apug.class, aupr.class, apuq.class, apuh.class, apur.class, aqrf.class, arau.class, apup.class, apul.class, apun.class, apui.class, apuj.class, apuo.class});
            case NEW_MUTABLE_INSTANCE:
                return new asbd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asbd.class) {
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
