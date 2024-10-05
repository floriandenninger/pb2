package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arjs extends aonm implements aooz {
    public static final arjs a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        arjs arjsVar = new arjs();
        a = arjsVar;
        aonm.registerDefaultInstance(arjs.class, arjsVar);
    }

    private arjs() {
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
                return newMessageInfo(a, "\u0001#\u0001\u0000\uf321Ẑ\ue1c0ꉹ#\u0000\u0000#\uf321Ẑᐼ\u0000\uf26a⤒ᐼ\u0000\ue607⨅ᐼ\u0000\uf88a\u2cf8ᐼ\u0000\uefcf⸵ᐼ\u0000￣⺒ᐼ\u0000\uec67むᐼ\u0000突ハᐼ\u0000\uf3fbヺᐼ\u0000\uf1ca㟄ᐼ\u0000\ue422㢒ᐼ\u0000\ufddd㢧ᐼ\u0000\uf5a4㧕ᐼ\u0000︍㧬ᐼ\u0000︊㾮ᐼ\u0000\ue9e9䅮ᐼ\u0000\ue621䊃ᐼ\u0000ﲸ䍖ᐼ\u0000\ue8cb䔆ᐼ\u0000\ue493䣤ᐼ\u0000\ueb41䣥ᐼ\u0000\uf492䤳ᐼ\u0000\ueb17䪝ᐼ\u0000\uf2cb䬘ᐼ\u0000\ue684䭌ᐼ\u0000\ue923䶡ᐼ\u0000\ue8a1勇ᐼ\u0000ￗ勋ᐼ\u0000\ue60b囤ᐼ\u0000\uf175援ᐼ\u0000\ueb32棪ᐼ\u0000\ue860瞦ᐼ\u0000\uf396薼ᐼ\u0000\uf153詬ᐼ\u0000\ue1c0ꉹᐼ\u0000", new Object[]{"c", "b", aqdt.class, asjh.class, avul.class, atiy.class, atcf.class, aqxc.class, avkp.class, aqku.class, arej.class, aqvd.class, avii.class, asiy.class, avet.class, avpr.class, avpt.class, aqwt.class, avrk.class, avrw.class, avql.class, avrl.class, avhy.class, aqrf.class, avnl.class, avnm.class, avpa.class, aqzh.class, avrr.class, avpl.class, apxi.class, atjo.class, avoo.class, avqj.class, avrj.class, avqu.class, aqee.class});
            case NEW_MUTABLE_INSTANCE:
                return new arjs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arjs.class) {
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
