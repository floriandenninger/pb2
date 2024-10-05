package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arjw extends aonm implements aooz {
    public static final arjw a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arjw arjwVar = new arjw();
        a = arjwVar;
        aonm.registerDefaultInstance(arjw.class, arjwVar);
    }

    private arjw() {
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
                return newMessageInfo(a, "\u0001\u0013\u0001\u0000\ue7f5ណ\ue559\ua63e\u0013\u0000\u0000\u0013\ue7f5ណᐼ\u0000\uf597ᣚᐼ\u0000\ue9fdᮽᐼ\u0000\ue592᯦ᐼ\u0000\uece4Ỽᐼ\u0000\uf11e⠗ᐼ\u0000\uebb5ⴛᐼ\u0000\uf3f6㑄ᐼ\u0000\ue422㢒ᐼ\u0000\uf5a4㧕ᐼ\u0000ﲿ䘟ᐼ\u0000\uf59d䫛ᐼ\u0000\ue214佨ᐼ\u0000\uef90勀ᐼ\u0000\uf812憡ᐼ\u0000\uf175援ᐼ\u0000\ue12e睴ᐼ\u0000ﱿ銹ᐼ\u0000\ue559\ua63eᐼ\u0000", new Object[]{"c", "b", auov.class, arkf.class, arke.class, atdn.class, arkb.class, aquj.class, aqvx.class, avid.class, avii.class, avet.class, avke.class, atld.class, aslh.class, atlc.class, aqhq.class, atjo.class, avqd.class, atcg.class, astt.class});
            case NEW_MUTABLE_INSTANCE:
                return new arjw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arjw.class) {
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
